package com.kaspersky.kaspresso.compose

import com.kaspersky.kaspresso.compose.pack.ActionsOnElementsPack
import com.kaspersky.kaspresso.compose.pack.ActionsPack

/**
 * The interface to provide composing actions and assertions functionality.
 */
interface ComposeProvider<ElementType> {

    /**
     * Composes a [block] of actions with their views to invoke on in one composite action that succeeds if at least
     * one of it's parts succeeds.
     *
     * @param block the actions to compose.
     */
    fun compose(block: ActionsOnElementsPack<ElementType>.() -> Unit)

    /**
     * Composes a [block] of actions on the given view of type [T] in one composite action that succeeds if at least
     * one of it's parts succeeds.
     *
     * @param block the actions to compose.
     */
    fun <T : ElementType> T.compose(block: ActionsPack<T>.() -> Unit)
}