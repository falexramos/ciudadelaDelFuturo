import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FechasConstrucionComponent } from './fechas-construcion.component';

describe('FechasConstrucionComponent', () => {
  let component: FechasConstrucionComponent;
  let fixture: ComponentFixture<FechasConstrucionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FechasConstrucionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FechasConstrucionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
