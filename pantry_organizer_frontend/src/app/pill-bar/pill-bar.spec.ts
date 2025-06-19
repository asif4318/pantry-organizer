import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PillBar } from './pill-bar';

describe('PillBar', () => {
  let component: PillBar;
  let fixture: ComponentFixture<PillBar>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PillBar]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PillBar);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
