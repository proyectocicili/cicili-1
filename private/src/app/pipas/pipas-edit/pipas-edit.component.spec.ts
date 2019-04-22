import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PipasEditComponent } from './pipas-edit.component';

describe('PipasEditComponent', () => {
  let component: PipasEditComponent;
  let fixture: ComponentFixture<PipasEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PipasEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PipasEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
