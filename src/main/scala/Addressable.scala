package tech.rocksavage.chiselware.AddressDecoder

import chisel3._
import chisel3.util._

class Addressable(val size: Int, val closure: (UInt, UInt) => Unit) {}