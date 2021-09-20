import { TestBed } from '@angular/core/testing';

import { ConstrutionRequestService } from './constrution-request.service';

describe('ConstrutionRequestService', () => {
  let service: ConstrutionRequestService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ConstrutionRequestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
