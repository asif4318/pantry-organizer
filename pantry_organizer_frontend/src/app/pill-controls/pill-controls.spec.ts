import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PillControls } from './pill-controls';

describe('PillControls', () => {
  let component: PillControls;
  let fixture: ComponentFixture<PillControls>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PillControls]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PillControls);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
