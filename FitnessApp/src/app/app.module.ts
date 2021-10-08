import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
 
import { ToastrModule } from 'ngx-toastr';
// services
// import { InterceptorService } from './_services/interceptor.service';
import { UserService } from './_services/user.service';
 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { MentorComponent } from './mentor/mentor.component';
import { AddMentorComponent } from './add-mentor/add-mentor.component';
import { SearchPipe } from './search.pipe';
// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
 
@NgModule({
declarations: [
AppComponent,
LoginComponent,
RegisterComponent,
HomeComponent,
MentorComponent,
AddMentorComponent,
SearchPipe
],
imports: [
BrowserModule,
AppRoutingModule,
ReactiveFormsModule,
HttpClientModule,
BrowserAnimationsModule, // required animations module
ToastrModule.forRoot()
],
providers: [UserService,
    // { provide: HTTP_INTERCEPTORS, useClass: InterceptorService, multi: true}
], 
bootstrap: [AppComponent]
})
export class AppModule { }