import { Component, input } from '@angular/core';
import { ItemInterface } from '../Interfaces/item-interface';

@Component({
  selector: 'app-item-card',
  imports: [],
  templateUrl: './item-card.html',
  styleUrl: './item-card.css'
})

export class ItemCard {
  item = input<ItemInterface>();
}
