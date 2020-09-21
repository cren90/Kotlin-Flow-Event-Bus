# Kotlin-Flow-Event-Bus
An easy to use event bus based on Kotlin Coroutine flows

### Specs
[![](https://jitpack.io/v/cren90/Kotlin-Flow-Event-Bus.svg)](https://jitpack.io/#cren90/Kotlin-Flow-Event-Bus) [![API](https://img.shields.io/badge/API-16%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=16) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# Download

This library is available in **jitpack**

## Gradle
In project level gradle file add 
```gradle
allprojects {
 repositories {
    maven { url "https://jitpack.io" }
 }
}
```
 
```gradle
dependencies {
    // other dependencies here
    
	        implementation 'com.github.cren90:Kotlin-Flow-Event-Bus:<version>'
	}
```

# Usage
To post a new event call `EventBus.post(SampleEvent())`

To listen for new events, from a couroutine context call `EventBus.getEvents()` with optional `includeCurrentValue` `boolean` to get the Flow of events, optionally returning the most recent previous event as well.

# About the author

### Chris Renfrow
Android developer, Scrum Master

<a href='https://www.linkedin.com/in/crenfrow90?trk=profile-badge'><img src="https://github.com/cren90/icons/blob/master/linkedin.png" width="75" alt="Profile for Chris Renfrow on LinkedIn"></a> <a href="https://stackexchange.com/users/1000035"><img src="https://github.com/cren90/icons/blob/master/stackoverflow.png" width="75" alt="profile for cren90 on Stack Exchange, a network of free, community-driven Q&amp;A sites"></a> <a href="https://www.scrumalliance.org/community/profile/crenfrow2"><img src="https://github.com/cren90/icons/blob/master/seal-csm.png" width="75" alt="Profile for Chris Renfrow on Scrum Alliance Community."></a>

# Contribution

If you find a bug or would like to improve any aspect of it, feel free to contribute with pull requests.

# License

```
Copyright 2020 cren90

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


<script type="text/javascript" src="https://platform.linkedin.com/badges/js/profile.js" async defer></script>
