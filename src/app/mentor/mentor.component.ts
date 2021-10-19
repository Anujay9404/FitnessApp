import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Mentor } from '../Mentor';
import { MentorService } from '../_services/mentor.service';

@Component({
  selector: 'app-mentor',
  templateUrl: './mentor.component.html',
  styleUrls: ['./mentor.component.css']
})


export class  MentorComponent implements OnInit {

  // id:number = 0
  mentors: Array<Mentor> = [];
  showMessage: boolean = false;
  constructor(private route: ActivatedRoute,private mentorService: MentorService) { }

  deleteMentor(id: number){
    this.mentorService.deleteMentor(id)
    .subscribe((res: any) => {
      console.log(res);
      // this.courses = res;
      this.showMessage = true;
    });
  }

  // updateMentor(name:string){

  //   this.mentorService.updateMentor(this.id,{name})
  //   .subscribe((res: any) => {
  //     console.log(res);
  //     // this.courses = res;
  //     // this.showMessage = true;
  //   });
  // }
//  startWorkout(id: number){
//     this.workoutService.startEndWorkout(id,{startTime:new Date()})
//     .subscribe((res: any) => {
//       console.log(res);
//       // this.courses = res;

    
//     });
//   }
  // endWorkout(id: number){
  //   this.workoutService.startEndWorkout(id,{endTime:new Date()})
  //   .subscribe((res: any) => {
  //     console.log(res);
  //     // this.courses = res;
  //   });
  // }

//   getMinutesBetweenDates(startTime:Date,endTime:Date) {
//     var diff = (endTime.getTime() - startTime.getTime());
//     return (diff / 60000);
// }
  ngOnInit(): void {

    const id = this.route.snapshot.paramMap.get('id');
    console.log(id);
    

    console.log('Called once on load of the component');
    //http fetch code here ---
    // this.http.get('http://localhost:3000/courses/')
    this.mentorService.fetchAllMentor()
    .subscribe((res: any) => {
      console.log(res);
      this.mentors = res;
      // this.workouts.forEach((workout, i)=> {
      //   console.log(workout);
      //   if(workout.startTime && workout.endTime){
      //     var diffMinutes = this.getMinutesBetweenDates(new Date(workout.startTime), new Date(workout.endTime))
      //     console.log(`${workout.title} : ${diffMinutes}`)
      //     workout.totalCaloriesBurnt = (workout.cbpm * diffMinutes);
      //   }
    // /})
    });
  }
  
}

