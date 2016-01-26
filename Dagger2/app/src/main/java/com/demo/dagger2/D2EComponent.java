package com.demo.dagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {Dagger2Module.class})
public interface D2EComponent extends D2EGraph {

}
