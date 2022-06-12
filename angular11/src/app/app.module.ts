import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NotesComponent } from './notes/notes.component';
import { InformationComponent } from './information/information.component';
import { HighlightDirective } from './directives/highlight.directive';
import { FormComponent } from './form/form.component';
import { ListComponent } from './list/list.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Form2Component } from './form2/form2.component';
import { UserComponent } from './user/user.component';
import { ProvideComponent } from './provide/provide.component';
import { HttpClientModule } from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    NotesComponent,
    InformationComponent,
    HighlightDirective,
    FormComponent,
    ListComponent,
    Form2Component,
    UserComponent,
    ProvideComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
