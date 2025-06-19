import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Interface } from 'node:readline/promises';
import { ItemInterface } from './Interfaces/item-interface';

@Injectable({
  providedIn: 'root'
})
export class FoodService {
  private http = inject(HttpClient);
  private baseUrl = "http://localhost:8080"
  private data: ItemInterface[];

  constructor() {
    this.data = [
      {
        id: 1,
        name: 'Fish',
        image: 'https://img.freepik.com/free-vector/cute-fish-sea-animal-cartoon-sticker_1308-77492.jpg'
      },
      {
        id: 2,
        name: 'Cow',
        image: 'https://classroomclipart.com/image/static7/preview2/steak-uncooked-clip-art-59350.jpg'
      }
    ]
  }

  getString(): string {
    return "HELLLOOOOO"
  }
}
