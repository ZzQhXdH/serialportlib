package com.hontech.serialportlib

import java.io.IOException

class SerialPort (val ref: Long) {

    var isClose = false
        private set

    companion object {

        init {
            System.loadLibrary("serialportlib")
        }

        private external fun open(name: String, baudRate: Int): Long

        fun open2(name: String, baudRate: Int): SerialPort {
            val fd = open(name, baudRate)
            if (fd < 0) {
                throw IOException("串口打开失败:${name}")
            }
            return SerialPort(fd)
        }

    }

    fun read(buf: ByteArray) {
        read(ref, buf)
    }

    fun write(buf: ByteArray) {
        write(ref, buf)
    }

    fun close() {
        if (isClose) {
            throw IOException("串口已经关闭")
        }
        close(ref)
        isClose = true
    }


    private external fun close(fd: Long)
    private external fun read(fd: Long, buf: ByteArray): Int
    private external fun write(fd: Long, buf: ByteArray): Int
}