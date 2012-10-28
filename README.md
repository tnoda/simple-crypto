# simple-crypto

A Clojure library designed to perform weak encryption, based on 128-bit AES.


## Dependency information

Leiningen dependency information:

    [org.clojars.tnoda/simple-crypto "0.1.0"]


## Usage

Example:

    user=> (require '[org.clojars.tnoda.simple-crypto :as c])
    nil

    ;;; The encrypt function expects a String value as its input
    ;;; and returns a byte array.
    user=> (c/encrypt "Hello, World" password)
    #<byte[] [B@774b9b80>

    ;;; Encryption and decryption.
    user=> (-> "Hello, World" (c/encrypt password) (c/decrypt password))
    "Hello, World"


## License

Copyright (c) 2012 Takahiro Noda

Distributed under the Eclipse Public License, the same as Clojure.
