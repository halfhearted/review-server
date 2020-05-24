package com.halfhearted.review.common

import akka.actor.{ ActorRef, ActorSystem, PoisonPill, Props }
import akka.cluster.singleton.{ ClusterSingletonManager, ClusterSingletonManagerSettings }


trait Bootstrap {

    def startActorSingleton( system: ActorSystem, props: Props, name: String, terminationMessage: PoisonPill ): ActorRef = {
        system.actorOf(
            ClusterSingletonManager.props(
                singletonProps = props,
                terminationMessage = terminationMessage,
                settings = ClusterSingletonManagerSettings( system ),
            ),
            name
        )
    }
}