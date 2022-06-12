import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {

  constructor() {

  }
  info(value:any){
    console.log("gg");
    console.log(value);

  }
  error(value:any){
    console.log("gg");
    console.log(value);

  }
  warn(value:any){
    console.log("gg");
    console.log(value);
  }

}
