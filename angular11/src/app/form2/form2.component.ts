import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { NgForm } from '@angular/forms';
import { notes } from '../models/note.model';

@Component({
  selector: 'app-form2',
  templateUrl: './form2.component.html',
  styleUrls: ['./form2.component.scss']
})
export class Form2Component implements OnInit {
  @Output() save:EventEmitter<any>= new EventEmitter;
  note:notes=new notes;
  constructor() { }

  ngOnInit(): void {
  }
  onSubmitNote(form:NgForm){
    if(form.valid)
{
  let objCP= Object.assign({},this.note);
  this.save.emit(objCP);
  form.reset();

}
else{
  alert("Vui long hoan thanh");

}
 }

}
