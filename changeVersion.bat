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

set /p version=������汾��:

call mvn versions:set -DnewVersion=%version%

call mvn versions:commit

pause
