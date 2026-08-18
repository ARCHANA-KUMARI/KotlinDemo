package com.example.demoforoutsidemodule.sealedUsecases
/*

class ServerError : com.example.kotlindemo.oops.sealed.Error() {
}*/

// Sealed class can't be used as a super class in another module. It can only be used in the same module where it is defined. So, we cannot extend the sealed class Error from another module.
