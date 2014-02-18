(ns omchaya.api.mock
  (:require [cljs.core.async :as async :refer [>! <! alts! chan sliding-buffer put! close!]]
            [omchaya.mock-data :as mock-data])
  (:require-macros [cljs.core.async.macros :as am :refer [go go-loop alt!]]))

(defn random-message [api-ch channel]
  (put! api-ch [:channel-activity-received (mock-data/random-message channel)]))
