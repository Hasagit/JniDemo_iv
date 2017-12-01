# Sets the minimum version of CMake required to build the native
# library. You should either keep the default value or only pass a
# value of 3.4.0 or lower.

cmake_minimum_required(VERSION 3.4.1)

#引用已经有的库
find_library( # Sets the name of the path variable.
              log-lib

               # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

#资源文件夹的位置libs
set(distribution_DIR ${CMAKE_SOURCE_DIR}/../../../../libs)

#导入类库,只是作为引用,不编译
add_library( Hello
             SHARED
             IMPORTED )

#引用目标类库是本地类库位置在libs/armeabi-v7a/libHello.so
set_target_properties( Hello
                       PROPERTIES IMPORTED_LOCATION
                       ../../../../libs/armeabi-v7a/libHello.so )

#添加类库位置在src/main/cpp/xxx.cpp需要编译
add_library(demo_lib
             SHARED
             src/main/cpp/com_jnidemo_iv_JniUtil.c)

#引入头文件目录位置
include_directories(libs/jpeg)

#将预构建库与你本地库相关联
target_link_libraries( # Specifies the target library.
                       demo_lib Hello

                       # Links the target library to the log library
                       # included in the NDK.
                       ${log-lib} )
