This is a simple project to demonstrate the Kotlin Multiplatform Project from scratch.

Step 1: Create an empty project;

Step 2: create .gitignore file to ignore the following files or folders:
    - .kotlin
    - .gradle
    - .idea
    - **/build

step 3: Creating the initial settins.gradle.kts, including:
    - repositories for plugins management;
    - repositories for dependencies management;
    - include project path: app

Step 4: Loading the Kotlin Multiplatform plugin in build.gradle.kts file

Step 5: Setup the :app module
    --project root
        |____app
        |     |____src
        |     |____build.gradle.kts
        |____gradle

Step 6: Setup the compose plugin in build.gradle.kts file from the root folder.

Step 7: Writing the first #Composable function: MainScreen.kt in app/src/commonMain/kotlin/<name_space>/

Step 8: Creating the MainActivity in app/src/androidMain/kotlin/<name_space>/

Step 9: Resolve some build & run issues

Step 10: Building .framework files for iOS (Xcode project)



Reference:
Video: https://www.youtube.com/watch?v=fmFezt-2IBo

source code: https://github.com/garymar2007/kmp-app-from-scratch

19:14

    
