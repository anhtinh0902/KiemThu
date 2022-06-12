import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  @Input() appHighlight:any;
  @Input() color:string="yellow";

  constructor(private el :ElementRef)
  {

  }
  @HostListener("mouseenter") onMouseenter(){
    this.highlight(this.color)
  }
  @HostListener("mouseleave") onMouseleave(){
    this.highlight("")
  }

  private highlight(color:string){
    this.el.nativeElement.style.backgroundColor=color;
  }

}
