import { Pipe, PipeTransform } from '@angular/core';
import { Mentor } from './Mentor';


@Pipe({
  name: 'searchWorkout'
})
export class SearchPipe implements PipeTransform {

  transform(mentors: Array<Mentor>, searchValue: string): Array<Mentor> {
    console.log(mentors);
    console.log(searchValue)

    let filteredMentors = mentors.filter(mentor=> mentor.course.toLowerCase().includes(searchValue.toLowerCase()))

    return filteredMentors;
  }

}

