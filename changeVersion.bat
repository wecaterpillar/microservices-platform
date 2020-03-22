@echo on
@echo =============================================================
@echo $                                                           $
@echo $           Open EA Microservices-Platform                  $
@echo $                                                           $
@echo $                                                           $
@echo $                                                           $
@echo $  Open EA All Right Reserved                               $
@echo $  Copyright (C) 2018-2050                                  $
@echo $                                                           $
@echo =============================================================
@echo.
@echo off

@title Open EA Microservices-Platform
@color 0e

set /p version=������汾��:

call mvn versions:set -DnewVersion=%version%

call mvn versions:commit

pause
