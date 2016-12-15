(ns weatherfu.core
  (:require [csv-map.core :refer [parse-csv]])
  (:gen-class))

(def data (parse-csv (slurp "resources/daily-temps1.csv") :key :keyword))

(def five-day-segments (partition 5 1 data))

(defn first-num
  [temp]
  (str (first temp)))

(defn distinct-first-nums
  [days]
  (->> days
       (map :high)
       (map first-num)
       distinct
       count))

(def distinct-first-nums-per-five-day-segment
  (->> five-day-segments
       (map distinct-first-nums)))


;print all the qualifying segments as sanity check
(doseq [s five-day-segments
      :when (< 3 (distinct-first-nums s))]
  (println (map :high s)))

(defn -main
  [& args]
  (let [total-days      (count data)
        qualifying-days (count (filter #(< 3 %) distinct-first-nums-per-five-day-segment))]
    (println (float (/ qualifying-days total-days)))))

