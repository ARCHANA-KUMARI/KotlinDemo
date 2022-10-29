package com.example.kotlindemo.oops.Inline

/**
 * @Author: Archana Kumari
 * @Date: 29-10-2022
 */
typealias nameTypeAlias = String
@JvmInline
value class InlineVsAliasDemo(val s : String) {
}
fun asseptString(s: String) {}
fun asseptNameTypeAlias(name : nameTypeAlias) {}
fun asseptNameInlineClass(p : InlineVsAliasDemo) {}