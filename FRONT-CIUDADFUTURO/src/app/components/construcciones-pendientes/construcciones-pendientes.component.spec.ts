import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConstruccionesPendientesComponent } from './construcciones-pendientes.component';

describe('ConstruccionesPendientesComponent', () => {
  let component: ConstruccionesPendientesComponent;
  let fixture: ComponentFixture<ConstruccionesPendientesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConstruccionesPendientesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConstruccionesPendientesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
