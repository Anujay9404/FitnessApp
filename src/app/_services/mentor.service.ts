import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class MentorService {

  constructor(private http: HttpClient) { }
  fetchAllMentor(){
    return this.http.get('http://localhost:9001/mentors/');
  }
  deleteMentor(id: number){
    return this.http.delete( 'http://localhost:9001/mentors/'+ id)
  }

  addMentor(mentor: any){
    return this.http.post( 'http://localhost:9001/mentors/', mentor);
  }
  startEndWorkout(id:number, obj:any){
    return this.http.patch( environment.baseUrl +"/" + id, obj)
  }

  updateMentor(id: number, mentor: any){
    return this.http.patch( 'http://localhost:9001/mentors/' +"/"+ id,mentor)
  }

 
}
