import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SensorComponentComponent } from './sensor-component.component';

describe('SensorComponentComponent', () => {
  let component: SensorComponentComponent;
  let fixture: ComponentFixture<SensorComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SensorComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SensorComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
