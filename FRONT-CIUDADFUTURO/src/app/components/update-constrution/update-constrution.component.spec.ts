import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateConstrutionComponent } from './update-constrution.component';

describe('UpdateConstrutionComponent', () => {
  let component: UpdateConstrutionComponent;
  let fixture: ComponentFixture<UpdateConstrutionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateConstrutionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateConstrutionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
