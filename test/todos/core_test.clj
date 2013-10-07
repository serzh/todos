(ns todos.core-test
  (:use clojure.test
        todos.core))

(deftest new-todo-test
  (testing "build new todo"
    (is (= {:text "Wash dishes!"} (new-todo "Wash dishes!")))))

(deftest save-todo-test
  (testing "save new todo"
    (let [todo (new-todo "Some text")]
      (save-todo todo)
      (is (= [todo] (all-todos))))))
