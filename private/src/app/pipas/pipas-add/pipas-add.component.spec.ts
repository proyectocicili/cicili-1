import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PipasAddComponent } from './pipas-add.component';

describe('PipasAddComponent', () => {
  let component: PipasAddComponent;
  let fixture: ComponentFixture<PipasAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PipasAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PipasAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
