import { TestBed } from '@angular/core/testing';

import { WeCartFormService } from './we-cart-form.service';

describe('WeCartFormService', () => {
  let service: WeCartFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WeCartFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
