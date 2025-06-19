import { Component, input } from '@angular/core';

@Component({
  selector: 'app-pill-controls',
  imports: [],
  templateUrl: './pill-controls.html',
  styleUrl: './pill-controls.css'
})

export class PillControls {
  label = input<string>();
}
