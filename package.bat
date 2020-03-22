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

call mvn clean package -Dmaven.test.skip=true

pause
