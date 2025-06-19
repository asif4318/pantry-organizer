import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PillBar } from './pill-bar/pill-bar';
import { ItemGrid } from './item-grid/item-grid';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, PillBar, ItemGrid],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'pantry_organizer_frontend';
}
