# Migrating from Dagger to Hilt in your Android app

This folder contains the source code for the "Migrating from Dagger to Hilt in your Android app" codelab.

The codelab is built in multiple GitHub branches:
* `master` is the codelab's starting point.
* `interop` is an intermediate step in which Dagger and Hilt coexist.
* `solution` contains the solution to this codelab.


# Introduction
Hilt is built on top of the popular DI library Dagger to benefit from the compile time correctness, runtime performance, scalability, and Android Studio support that Dagger provides. 

Since many Android framework classes are instantiated by the OS itself, there's an associated boilerplate when using Dagger in Android apps. Unlike Dagger, Hilt is integrated with Jetpack libraries and Android framework classes and removes most of that boilerplate to let you focus on just the important parts of defining and injecting bindings without worrying about managing all of the Dagger setup and wiring. It automatically generates and provides:

* Components for integrating Android framework classes with Dagger that you would otherwise need to create by hand.
* Scope annotations for the components that Hilt generates automatically.
* Predefined bindings and qualifiers.

As Dagger and Hilt can coexist together, apps can be migrated on an as-needed basis.


# Pre-requisites
* Experience with Kotlin syntax.
* Experience with Dagger.

# Getting Started
1. Install Android Studio, if you don't already have it.
2. Download the sample.
3. Import the sample into Android Studio.
4. Build and run the sample.