Eclipse project for android to use two USB Webcams simultaneously.

To run this application, the following conditions should be satisfied.

1) The kernel is V4L2 enabled, e.g.,

 CONFIG_VIDEO_DEV=y

 CONFIG_VIDEO_V4L2_COMMON=y

 CONFIG_VIDEO_MEDIA=y

 CONFIG_USB_VIDEO_CLASS=y

 CONFIG_V4L_USB_DRIVERS=y

 CONFIG_USB_VIDEO_CLASS_INPUT_EVDEV=y

2) The permissions of /dev/video0,1 are set 0666 in /ueventd.xxxx.rc

3) USB WebCams are UVC camera, and they supports 640x480 resolution with MJPEG format.

Supported platform : Iconia Tab A500. 

 This application will also work in V4L2-enabled pandaboard and beagleboard.


This software is based in part on the work of the Independent JPEG Group.

Moreover, for decoding MJPEG, some codes in OpenCV are utilized.

Therefore, before downloading, you have to agree to the following license.

//////////////////////////////////////////////////////////////////////////////////

IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.

By downloading, copying, installing or using the software you agree to this license.

If you do not agree to this license, do not download, install,

copy or use the software.


                        Intel License Agreement

                For Open Source Computer Vision Library

Copyright (C) 2000, Intel Corporation, all rights reserved.

Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,

are permitted provided that the following conditions are met:

  * Redistribution's of source code must retain the above copyright notice,

    this list of conditions and the following disclaimer.

  * Redistribution's in binary form must reproduce the above copyright notice,

    this list of conditions and the following disclaimer in the documentation

     and/or other materials provided with the distribution.

  * The name of Intel Corporation may not be used to endorse or promote products

    derived from this software without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and

any express or implied warranties, including, but not limited to, the implied

warranties of merchantability and fitness for a particular purpose are disclaimed.

In no event shall the Intel Corporation or contributors be liable for any direct,

indirect, incidental, special, exemplary, or consequential damages

(including, but not limited to, procurement of substitute goods or services;

loss of use, data, or profits; or business interruption) however caused

and on any theory of liability, whether in contract, strict liability,

or tort (including negligence or otherwise) arising in any way out of

the use of this software, even if advised of the possibility of such damage.
