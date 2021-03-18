/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.dagger.user

import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

/**
 * UserDataRepository contains user-specific data such as username and unread notifications.
 *
 * This object will have a unique instance in a Component that is annotated with
 * @LoggedUserScope (i.e. only UserComponent in this case).
 */
@Singleton
class UserDataRepository @Inject constructor() {

    var username: String? = null
        private set

    var unreadNotifications: Int? = null
        private set

    init {
        unreadNotifications = randomInt()
    }

    fun refreshUnreadNotifications() {
        unreadNotifications = randomInt()
    }
    fun initData(username: String) {
        this.username = username
        this.unreadNotifications = randomInt()
    }

    fun cleanUp() {
        username = null
        unreadNotifications = -1
    }

    private fun randomInt(): Int {
        return Random.nextInt(until = 100)
    }
}
