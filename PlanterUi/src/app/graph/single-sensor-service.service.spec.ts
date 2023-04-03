import { TestBed } from '@angular/core/testing';

import { SingleSensorServiceService } from './single-sensor-service.service';

describe('SingleSensorServiceService', () => {
  let service: SingleSensorServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SingleSensorServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
