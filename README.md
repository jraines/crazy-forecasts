# A weather puzzle

Zach Lowe [asks](https://twitter.com/ZachLowe_NBA/status/809482337545232384): "Current 5-day forecast for NYC features high temps starting with four different #s. Can someone at @FiveThirtyEight tell me odds of that?"

Rather than using historical forecasts, I used actual recorded temps because
they were easily available from [the National Centers for Environmental
Information](https://www.ncdc.noaa.gov/).

The data (in this repo under `resources/daily-temps1.csv`) is from the beginning
of 2012 and gives the highest and lowest temp per day recorded in Central Park.

If you're into code, check out how easy Clojure makes this (see `src/weatherfu/core.clj`).

For each day, I look at a window of 5 days including that one, and see if the
first number of the high temp is different for at least 4.

The answer to the question is _4.8%_, which is higher than I would've guessed!
Heck, maybe it's wrong -- if you spot an error let me know @jraines

If you increaes the number to 5 distinct first digits for the high temp in 5
days, the probability drops to 0.3%

<a rel="license" href="http://creativecommons.org/licenses/by/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by/4.0/88x31.png" /></a><br />This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/4.0/">Creative Commons Attribution 4.0 International License</a>.
