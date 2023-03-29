import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChosenconfigurationComponent } from './chosenconfiguration.component';

describe('ChosenconfigurationComponent', () => {
  let component: ChosenconfigurationComponent;
  let fixture: ComponentFixture<ChosenconfigurationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChosenconfigurationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ChosenconfigurationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
