import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddConstrutionRequestComponent } from './add-constrution-request.component';

describe('AddConstrutionRequestComponent', () => {
  let component: AddConstrutionRequestComponent;
  let fixture: ComponentFixture<AddConstrutionRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddConstrutionRequestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddConstrutionRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
