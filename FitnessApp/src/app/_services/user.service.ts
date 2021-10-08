import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../_models/User';
import { environment } from 'src/environments/environment';
 
@Injectable({ providedIn: 'root' })
export class UserService {
constructor(private http: HttpClient) { }
 
register(user: User) {
return this.http.post('http://localhost:9001/users/', user);
}
 
// login(user:any){
//     return this.http.post('',user);
// }
}
