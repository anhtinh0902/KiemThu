import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { notes } from '../models/note.model';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {
  formNote:FormGroup|any;
  @Output() save:EventEmitter<any> = new EventEmitter;
  @Input() note:notes = new notes;
  constructor() { }

  ngOnInit(): void {
    this.createForm();
  }
  createForm(){
    this.formNote=new FormGroup({
      'name':new FormControl(null,[Validators.required,Validators.minLength(3)]),
      'content':new FormControl(null,[Validators.required,Validators.minLength(3)]),
      'status':new FormControl(0,[])
    })
  }
  onSubmit(){
    if(this.formNote.valid)
    {
      let copi = Object.assign({},this.note);
      this.save.emit(copi);
      this.note = new notes;
      this.formNote.reset();
    }
    else
    alert("Vui long nhap lai!!!");
  }
  cancelEdit(){
    this.note = new notes;
  }
}
