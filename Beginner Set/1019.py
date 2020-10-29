# -*- coding: utf-8 -*-

time = input()
time = int(time)

hours = time / 3600
minutes = time % 3600 / 60
seconds = time % 60

print("%d:%d:%d" %(hours, minutes, seconds))
