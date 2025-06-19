import { Component, inject, OnInit } from '@angular/core';
import { ItemCard } from '../item-card/item-card';
import { ItemInterface } from '../Interfaces/item-interface';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-item-grid',
  imports: [ItemCard],
  templateUrl: './item-grid.html',
  styleUrl: './item-grid.css'
})

export class ItemGrid implements OnInit {
  public itemsData: ItemInterface[];
  private http = inject(HttpClient);
  

  ngOnInit(): void {
  }

  constructor(private service: HttpClient) {
    this.http.get('http://localhost:8080/food/all').subscribe(data => {
      console.log(data);
    })
    
    this.itemsData = [
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
}
