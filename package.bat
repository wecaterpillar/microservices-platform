@echo on
@echo =============================================================
@echo $                                                           $
@echo $               OpenEA ESP                  $
@echo $                                                           $
@echo $                                                           $
@echo $                                                           $
@echo $  OpenEA All Right Reserved                                   $
@echo $  Copyright (C) 2019-2050                                  $
@echo $                                                           $
@echo =============================================================
@echo.
@echo off

@title OpenEA ESP
@color 0e

call mvn clean package -Dmaven.test.skip=true

pause
