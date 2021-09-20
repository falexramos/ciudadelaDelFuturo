import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListConstrutionComponent } from './list-constrution.component';

describe('ListConstrutionComponent', () => {
  let component: ListConstrutionComponent;
  let fixture: ComponentFixture<ListConstrutionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListConstrutionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListConstrutionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
