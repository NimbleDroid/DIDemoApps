package com.nimbledroid.demo.dagger2;

import com.nimbledroid.demo.dagger2.module.Dagger2Module;
import com.nimbledroid.demo.dagger2.module.ModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {Dagger2Module.class, ModelModule.class})
public interface D2EComponent extends D2EGraph {

}
