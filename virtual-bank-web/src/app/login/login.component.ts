import { Component, OnInit } from '@angular/core';
import { LoginService } from '../service/login.service';
import { NzMessageService } from 'ng-zorro-antd/message';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  size: any;
  visibleAcitvation:any =false;
  placement:any= "bottom";
  showLoading:boolean = false;
  username: String;
  password: String;
  constructor(
    private loginService: LoginService,
    private message: NzMessageService
  ) { }

  ngOnInit() {
    this.size ="large";
    
  }
  openActivateCard(){
    this.visibleAcitvation = true
  }
  closeActivateCard(): void {
    this.visibleAcitvation = false;
  }
  hideLoading(){
    this.showLoading = false;
  }
  emptyInput(){
    this.password = "";
    this.username = ""
  }
  userLogin(){

    this.showLoading = true;
    this.loginService.userLogin(this.username, this.password)
    .subscribe(
      (data:any)=>{
        if(data&&data.statusCode =="0"){
          this.emptyInput();
          this.hideLoading();
          this.message.create("success", `Login Success!`);
          return data;
        }else{
          this.emptyInput();
          this.hideLoading();
          this.message.create("error", data.errorMsg);
        }
      },
      error =>{
        console.log(error)
      }
    )
  }
}
