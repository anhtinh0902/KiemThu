import { Component, forwardRef, OnInit } from '@angular/core';
import { ControlValueAccessor, NG_VALUE_ACCESSOR } from '@angular/forms';
import { province } from '../models/province.model';

@Component({
  selector: 'app-provide',
  templateUrl: './provide.component.html',
  styleUrls: ['./provide.component.scss'],
  providers :[
    {
    provide:NG_VALUE_ACCESSOR,
    useExisting:forwardRef(() => ProvideComponent),
    multi:true
    }
    ]
})
export class ProvideComponent implements ControlValueAccessor {

  list:province[]=[
    {id:0,name:"Ho Chi Minh"},
    {id:0,name:"Ha Noi"},
    {id:0,name:"Lam Dong"},
  ];
  isShow:boolean=false;
  data:province = new province;
  onChange:any = ()=>{}
  onTouch:any=()=>{}
  writeValue(obj: any): void {
  this.data=obj;
  }
  close(){
    this.isShow=false;
  }
  doChoose(item:province){
    this.writeValue(item);
    this.onChange(item);
    this.close();
  }
  registerOnChange(fn: any): void {
    this.onChange=fn;
  }
  registerOnTouched(fn: any): void {
    this.onTouch=fn;
  }


}
