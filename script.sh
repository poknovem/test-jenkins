#!/bin/bash

NAME=$1
LASTNAME=$2
NICKNAME=$3
SHOW=$4

if [ "$SHOW" = "true" ]; then
    echo "Hello, $NAME $LASTNAME $NICKNAME"
else
    echo "If you want to see the name, please mark the show option."
fi

